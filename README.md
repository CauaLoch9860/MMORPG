# MMORPG Missions

## Descrição do Projeto
Este projeto é um web service desenvolvido em Spring Boot que gerencia quests para um jogo MMORPG. Ele permite a criação, consulta e obtenção de dicas para quests através de uma API RESTful.

## Pré-requisitos
- Java 17
- Maven
- IDE (ex: IntelliJ, Eclipse) ou um editor de código (ex: VS Code)
- Docker (opcional, para execução em contêiner)

## Rotas da API
-1. Obter todas as quests
-Ponto final :/quests
-Método: GET
-Exemplo de Requisição: GET http://localhost:8080/quests
Resposta: [
  {
    "id": "1",
    "title": "Aventura no Bosque",
    "description": "Ajude o aldeão a encontrar sua ovelha perdida.",
    "hint": "Verifique o pasto perto da floresta."
  },
  {
    "id": "2",
    "title": "Resgate na Montanha",
    "description": "Salve o príncipe preso no castelo.",
    "hint": "Olhe para o lado oeste da montanha."
  }
]

## Obter todas as dicas
-Ponto final :/quests/hints
-Método: GET
Exemplo de Requisição: GET http://localhost:8080/quests/hints
Resposta: [
  "Verifique o pasto perto da floresta.",
  "Olhe para o lado oeste da montanha."
]


## Obter dica de uma quest específica
-Ponto final :/quests/{id}/hint
-Método: GET
-Exemplo de Requisição:GET http://localhost:8080/quests/1/hint
Resposta: "Verifique o pasto perto da floresta."


## Adicionar uma nova quest
-Ponto final :/quests
-Método: POST
-Corpo da Requisição: {
  "id": "3",
  "title": "Exploração do Templo",
  "description": "Explore o antigo templo em busca de tesouros.",
  "hint": "Procure no altar principal."
}
Resposta: "Quest adicionada com sucesso!"


## Informações sobre o projeto
-Ponto final :/sobre
-Método: GET
-Exemplo de Requisição: GET http://localhost:8080/sobre
Resposta: {
  "estudante": "Cauã Loch Fernandes",
  "projeto": "MMORPG"
}



