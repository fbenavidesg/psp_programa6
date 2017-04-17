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
    <h2>Regla Simpson</h2>
    <table>
    	<tr>
    		<th>f(x)</th>
    		<th>dof</th>
    		<th>Resultado Esperado</th>
    		<th>Resultado Calculado</th>
    	</tr>
    	<tr>
    		<td>${resultSimpson.getX()}</td>
    		<td>${resultSimpson.getDof()}</td>
    		<td>${resultSimpson.getResultExpected()?string("####.##########")}</td>
    		<td>${resultSimpson.getResult()?string("####.##########")}</td>
    	</tr>
    </table>
</body>
</html>