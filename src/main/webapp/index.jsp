<html>
<body>
<h1>Volume Calculator</h1>
<form action="calculate" method="post">
    <label for="shapeType">Choose a shape:</label>
    <select name="shapeType" id="shapeType">
        <option value="cube">Cube</option>
        <option value="sphere">Sphere</option>
        <option value="tetrahedron">Tetrahedron</option>
    </select><br><br>

    <label for="parameter">Enter parameter (side/radius):</label>
    <input type="number" step="0.01" name="parameter" id="parameter" required><br><br>

    <input type="submit" value="Calculate Volume">
</form>
</body>
</html>
