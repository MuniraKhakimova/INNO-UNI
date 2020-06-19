import random


def name_to_number(name):
    if name == "rock":
        return 0
    elif name == "Spock":
        return 1
    elif name == "paper":
        return 2
    elif name == "lizard":
        return 3
    elif name == "scissors":
        return 4


def number_to_name(num):
    if num == 0:
        return "rock"
    elif num == 1:
        return "Spock"
    elif num == 2:
        return "paper"
    elif num == 3:
        return "lizard"
    elif num == 4:
        return "scissors"


def rpsls(player_choice):
    print(" ")
    print("Player chooses " + player_choice)
    player_number = name_to_number(player_choice)
    comp_number = random.randrange(0, 5)
    comp_choice = number_to_name(comp_number)
    print("Computer chooses " + comp_choice)
    diff = (player_number - comp_number) % 5
    if diff == 1 or diff == 2:
        print("The winner is: Player!")
    elif diff == 3 or diff == 4:
        print("The winner is: Computer!")
    else:
        print("Tie!")


player_choice = input()
rpsls(player_choice)
