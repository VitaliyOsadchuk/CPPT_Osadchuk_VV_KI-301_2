'''
Created on 20 лист. 2023 р.

@author: User
'''

size = int(input("Введіть розмір квадратної матриці: "))

while size <= 0:
    print("Розмірматриці повинен бути більшим за  0. Введіть коректний розмір.")
    size = int(input("Введіть розмір квадратної матриці:: "))

sym = ''

while True:
    sym_input = input("Введіть символ-заповнювач: ")
    if len(sym_input) != 1:
        print("Можна ввести тільки один символ-заповнювач.")
    else:
        sym = sym_input
        break

matrix = [[' ' for _ in range(size)] for _ in range(size)]

for i in range(size):
    for j in range(size):
        if i == 0 or i == size - 1 or j == 0 or j == size - 1:
            matrix[i][j] = sym
        elif i == 1 or i == size - 2 or j == 1 or j == size - 2:
            matrix[i][j] = ' '
        else:
            matrix[i][j] = sym

print(" ")
with open("MyFile.txt", "w") as fout:
    for i in range(size):
        for j in range(size):
            print(matrix[i][j], end=" ")
            fout.write(matrix[i][j] + " ")
        print()
        fout.write("\n")
