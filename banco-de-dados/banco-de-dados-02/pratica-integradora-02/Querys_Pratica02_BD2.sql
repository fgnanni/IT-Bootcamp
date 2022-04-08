#Selecione o nome, cargo e localização dos departamentos onde os vendedores trabalham. 
SELECT f.nome, f.cargo, d.localizacao FROM funcionario f JOIN departamento d ON f.depto_nro = d.depto_nro;

#Visualize departamentos com mais de cinco funcionários.
SELECT d.nome_depto FROM funcionario f JOIN departamento d ON f.depto_nro = d.depto_nro GROUP BY d.depto_nro HAVING count(f.depto_nro) >= 3;

#Exiba o nome, salário e nome do departamento dos funcionários que têm o mesmo cargo que 'Mito Barchuk'.
SELECT f.nome, f.salario, d.nome_depto 
FROM funcionario f  
JOIN funcionario m ON m.nome = "Mito" AND m.sobrenome = "Barchuk" and m.cargo = f.cargo
JOIN departamento d ON f.depto_nro = d.depto_nro;

SELECT f.nome, f.salario, d.nome_depto 
FROM funcionario f  
JOIN departamento d ON f.depto_nro = d.depto_nro
WHERE f.cargo IN (
	SELECT f.cargo 
	FROM funcionario f 
	WHERE f.nome = "Mito" AND f.sobrenome = "Barchuk"
);

#Mostre os dados dos funcionários que trabalham no departamento de contabilidade, ordenados por nome.
SELECT f.* FROM funcionario f WHERE f.depto_nro = "D-000-3" ORDER BY f.nome;

#Mostre o nome do funcionário que tem o menor salário.
SELECT f.nome FROM funcionario f where f.salario = (SELECT M(salario) FROM funcionario);

#Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas'.
SELECT f.* FROM funcionario f JOIN departamento d ON d.depto_nro = f.depto_nro AND d.nome_depto = "Vendas" ORDER BY f.salario DESC LIMIT 1;









