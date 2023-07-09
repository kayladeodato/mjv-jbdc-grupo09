# CRUD em JBDC usando Postgresql 


## Atividade:
A atividade consiste na realização do CRUD da classe Professor abaixo usando JBDC e Java, contendo as ações de inclusão, alteração, listar os dados, exclusão e pesquisa por nome. <br>
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/b55a06b2-6956-462b-88c5-e0caf45a8918)



## Tecnologias Utilizadas:
- Java 17;
- Postgresql;
- JBDC;

## Resultado:
Criação do banco e atributos:
```
create database mjv_java_school;

create table tab_professor(

	id serial4,
	nome varchar(50),
	dt_nascimento date,
	carga_horaria time,
	vl_hora numeric (7,2),
	fl_estrangeiro boolean,
	hr_disponiveis int,
	biografia text,
	dh_cadastro timestamp

);
```


Dados gravados em banco através do sistema.
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/0f6a8468-eaa5-47f6-9c45-8040597cf9d2)



## Equipe
- <a href="https://github.com/EriksonsSilva"> Erikson Silva </a>
- <a href="https://github.com/JonathanZapotosczny"> Jonathan Zapotosczny </a>
- <a href="https://github.com/Juuwes"> Juliana Gonçalves </a>
- <a href="https://github.com/JulioDinis"> Julio Dinis </a>
- <a href="https://github.com/KaylaDeodato"> Kayla Deodato </a>
- <a href="https://github.com/VictorAlmeida98"> Victor Almeida </a>
- <a href="https://github.com/fabiopenha"> Fábio Penha </a>
