package commands;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import problem.Catalog;
import problem.Item;
import commands.abstracts.*;


import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class ReportCommand extends Command {
    public ReportCommand(Item item) {
        super(item);
    }

    public void execute() throws Exception {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();

        Template velocityTemplate = velocityEngine.getTemplate("template.vm");

        VelocityContext context = new VelocityContext();
        context.put("title", super.item.getTitle());
        context.put("type", super.item.getType().toString());
        context.put("location", super.item.getLocation());
        context.put("year", super.item.getYear());
        context.put("author", super.item.getAuthor());

        StringWriter writer = new StringWriter();
        velocityTemplate.merge(context, writer); // NOT ON BYTES

        FileWriter fw = new FileWriter("velocityGenerated.html");
        fw.write(writer.toString());
        fw.close();

    }
}
