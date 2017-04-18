<!DOCTYPE html>
<html>
<head>
</head>
<style>
    table{
        border-collapse: collapse;
    }
    th,td {
        padding: 15px;
        text-align: center;
        border:1px solid gray;
    }
    td{
        text-align: rigth;
    }
</style>
<body>
    <h2>Busqueda de f(x) con Regla Simpson</h2>
    <table>
    	<tr>
                <th>p</th>
    		<th>dof</th>
    		<th>f(x) Esperado</th>
    		<th>f(x) Calculado</th>
    	</tr>
    	<tr>    
                <td>${resultSimpson.getResultExpected()?string("####.##########")}</td>
                <td>${resultSimpson.getDof()}</td>
    		<td>${resultSimpson.getX()}</td>
    		<td>${resultSimpson.getResult()?string("####.##########")}</td>
    	</tr>
    </table>
</body>
</html>