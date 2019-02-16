<!DOCTYPE html>
<html>
    <head>
        <title>Saluto personalizzato</title>
    </head>
    <body>
        <h1>Benvenuto, <% out.print(request.getParameter("nome")); %> </h1>
    </body>
</html>