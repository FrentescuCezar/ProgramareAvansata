package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exitBtn = new JButton("Exit");
    //create all buttons (Load, Exit, etc.)
    JButton loadBtn = new JButton("Load");
    JButton saveBtn = new JButton("Save");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 3));

        //add all buttons
        add(loadBtn);
        add(saveBtn);
        add(exitBtn);

        //configure listeners for all buttons
        exitBtn.addActionListener(this::exitGame);
        saveBtn.addActionListener(this::export);
    }

    private void export(ActionEvent actionEvent) {
        RenderedImage renderedImage = frame.canvas.image;

        File file = new File("E:\\NEW FRESH\\Facultate\\Anul 2\\Semestrul 2\\4.Programare Avansata\\ProgramareAvansata\\Laborator 6\\src\\PozaSave\\Joc.png");

        try {
            ImageIO.write(renderedImage, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void exitGame(ActionEvent actionEvent) {
        frame.dispose();
    }
}
