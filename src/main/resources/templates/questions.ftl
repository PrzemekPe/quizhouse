<#import "/spring.ftl" as spring/>
<html>
<head>
    <title>QUESTIONS</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Questions</h2>
    <table class="table">
        <tbody>

<#list questions as question>
<tr>
    <td>${question.id}</td>
    <td>${question.title}</td>
    <td><a href="/questions/edit/${question.id}" class="btn btn-primary">Edit</a></td>
    <td><a href="/questions/remove/${question.id}" type="button" class="btn btn-danger">Remove</a></td>
</tr>
</#list>
        </tbody>
    </table>
    <form action="/questions/add" method="post">
            <@spring.bind path="question"/>
        <div class="form-group">
            Tytuł:
        <@spring.formInput "question.title"/>
            <button type="submit" class="btn btn-success">Dodaj pytanie</button>
        </div>
    </form>


</body>
</html>

