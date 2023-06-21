# Habitatlivingbeing
Simulação de Pequeno Habitat (Java)
Este repositório contém um código para simular um pequeno habitat, onde vivem seis espécies de seres vivos: duas espécies de plantas (sálvia e rosmarinho) e quatro espécies de animais (coelhos pigmeus, coelhos europeus, raposas vermelhas e raposas velozes).

Funcionalidades
O usuário pode inserir os seguintes parâmetros para cada espécie de ser vivo:

Número inicial de exemplares;
Probabilidade de reprodução;
Taxa de reprodução.
Os parâmetros têm valores predefinidos, mas o usuário pode optar por inserir novos valores no início da simulação.

Cada passo da simulação consiste na alimentação e reprodução de cada ser vivo. No entanto, um ser vivo não pode nascer, reproduzir-se e alimentar-se no mesmo passo. Isso só acontece no próximo passo da simulação, após o nascimento.

O usuário indica quantos passos da simulação deseja executar.

No início da simulação e após a execução dos passos indicados pelo usuário, são apresentados o número de exemplares de cada espécie, assim como a probabilidade e taxa de reprodução correspondentes.

A simulação termina quando ocorrer uma das seguintes condições:

O número total de seres vivos ultrapassar um limite predefinido;
Alguma espécie de ser vivo for extinta;
O usuário selecionar a opção para encerrar a simulação.
Todas as interações com o usuário são validadas para evitar erros durante a execução da simulação. Em casos necessários, são tratadas exceções.

Requisitos e Execução
Java Development Kit (JDK)
IDE de sua escolha (Eclipse, IntelliJ, etc.)
Para executar a simulação, siga as etapas abaixo:

Clone este repositório:

bash
Copy code
git clone https://github.com/seu-usuario/nome-do-repositorio.git
Abra o projeto em sua IDE Java.

Compile e execute o arquivo principal.

Siga as instruções fornecidas no console para interagir com a simulação.

Contribuição
Contribuições para aprimorar este projeto são sempre bem-vindas. Sinta-se à vontade para abrir issues e enviar pull requests.

Licença
[Inserir a licença aplicável ao projeto]

Small Habitat Simulation (Java)
This repository contains code to simulate a small habitat where six species of living organisms reside: two species of plants (sage and rosemary) and four species of animals (pygmy rabbits, European rabbits, red foxes, and swift foxes).

Features
Users can input the following parameters for each species of living organisms:

Initial number of individuals
Reproduction probability
Reproduction rate
The parameters have default values, but users can choose to input new values at the beginning of the simulation.

Each simulation step involves feeding and reproduction for each living organism. However, a living organism cannot be born, reproduce, and feed within the same step. These actions occur in the next step, following birth.

Users indicate the number of simulation steps they want to execute.

At the start of the simulation and after executing the specified number of steps, the number of individuals for each species is
