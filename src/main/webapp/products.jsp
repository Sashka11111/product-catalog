<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Products List</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h1>Products</h1>
  <table class="table table-bordered">
    <thead>
    <tr>
      <th>ID</th>
      <th>Title</th>
      <th>Cost</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${products}">
      <tr>
        <td>${product.id}</td>
        <td>${product.title}</td>
        <td>${product.cost}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>
