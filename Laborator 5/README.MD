## Laboratory 5

### 1. Compulory Completed
### 2. Homework Completed + (1p) Tika, but I don't think if it did what it was supposed to do, I parsed the Catalog.class and showed its attributes and methods.


For the report I used Velocity : 

template.vm
```HTML
<html>
  <body>
    <main>
      <header>
            <h1>$title</h1>
            <h2>Type: $type</h2>
			<h3>Location : $location</h3>
			<h3>Year : $year</h3>
			<h3>Author : $author</h3>
          </header>
          <p>
            #if($type == "BOOK") You're reading a Book.
            #elseif($type == "NEWSPAPER") You're reading a newspaper.
            #elseif($type == "MAGAZINE") You're reading a magazine.
            #elseif($type == "JOURNAL") You're reading a journal.
            #elseif($type == "REVIEW") You're reading a review.
            #elseif($type == "ARTICLE") You're reading an article.#end
          </p>
    </main>
  </body>
</html>
```

velocityGenerated.html
```HTML
Being Youself
Type: BOOK
Location : https://www.facebook.com/frentescu.cezar/
Year : 2001
Author : Frentescu Cezar-Augustin
You're reading a Book.
```
