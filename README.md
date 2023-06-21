# Habitatlivingbeing
Simulação de Pequeno Habitat
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
Python 3.x
Para executar a simulação, siga as etapas abaixo:

Clone este repositório:

bash
Copy code
Navegue até o diretório do projeto:

arduino
Copy code
cd nome-do-repositorio
Execute o arquivo principal:

Copy code
python simulation.py
Siga as instruções fornecidas na linha de comando para interagir com a simulação.

Contribuição
Contribuições para aprimorar esse projeto são sempre bem-vindas. Sinta-se à vontade para abrir issues e enviar pull requests.

Licença

Small Habitat Simulation
This repository contains code to simulate a small habitat where six species of living organisms reside: two species of plants (sage and rosemary) and four species of animals (pygmy rabbits, European rabbits, red foxes, and swift foxes).

Features
Users can input the following parameters for each species of living organisms:

Initial number of individuals
Reproduction probability
Reproduction rate
The parameters have default values, but users can choose to input new values at the beginning of the simulation.

Each simulation step involves feeding and reproduction for each living organism. However, a living organism cannot be born, reproduce, and feed within the same step. These actions occur in the next step, following birth.

Users indicate the number of simulation steps they want to execute.

At the start of the simulation and after executing the specified number of steps, the number of individuals for each species is displayed, along with their corresponding reproduction probability and rate.

The simulation ends under the following conditions:

The total number of living organisms exceeds a predefined limit.
Any species of living organisms becomes extinct.
The user chooses to end the simulation.
All user interactions are validated to prevent errors during the simulation. Exception handling is implemented as needed.

Requirements and Execution
Python 3.x
To run the simulation, follow the steps below:

Clone this repository:

bash
Copy code
Navigate to the project directory:

bash
Copy code
cd repository-name
Run the main file:

Copy code
python simulation.py
Follow the instructions provided in the command line to interact with the simulation.

Contribution
Contributions to improve this project are always welcome. Feel free to open issues and submit pull requests.
