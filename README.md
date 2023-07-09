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

### Inserir
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/b55ce80f-7b86-4df0-a5f4-dfc241f2957e)
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/5e23a2f1-f1b0-40f0-bee8-9745dddeabed)

### Alterar
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/63516927-9316-4b21-a1ab-b8f9dbd9b564)
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/85334fce-93fb-422d-882b-70d2e3d9900c)


### Listar professores
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/033145b7-a79b-4b64-8b47-efde00c669ce)
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/4b4deab5-e072-4d86-b896-eeba99484fa9)
Por padrão a informação de falso no Postgresql fica vazio

### Excluir
Exclusão realizada do professor com id 32:
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/0dca86d2-c00d-481e-83bb-311ff0cfc1f6)<br>
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/5f56239f-1207-497c-aa97-f355f09a9af5)<br>
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/91544562-a957-42da-83bb-f13a322ed63d)<br>



### Busca por nome
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/c8edc81e-c83f-4ba2-bda4-33c04d07d887)<br>
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/d6762709-f440-4009-a733-1adea70dc761)<br>
![image](https://github.com/kayladeodato/mjv-jbdc-grupo09/assets/13575694/7bb10071-74c4-47a8-876d-013941a0a50e)<br>


## Interface Gráfica


## Equipe
- <a href="https://github.com/EriksonsSilva"> Erikson Silva </a>
- <a href="https://github.com/JonathanZapotosczny"> Jonathan Zapotosczny </a>
- <a href="https://github.com/Juuwes"> Juliana Gonçalves </a>
- <a href="https://github.com/JulioDinis"> Julio Dinis </a>
- <a href="https://github.com/KaylaDeodato"> Kayla Deodato </a>
- <a href="https://github.com/VictorAlmeida98"> Victor Almeida </a>
- <a href="https://github.com/fabiopenha"> Fábio Penha </a>
