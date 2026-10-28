


numbers = [
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
]

for rowIndex in range(len(numbers)):

    temporaryNumber = numbers[rowIndex][0]

numbers[rowIndex][0] = numbers[rowIndex][2]

numbers[rowIndex][2] = temporaryNumber

for rowIndex in range(len(numbers)):

    for columnIndex in range(len(numbers[rowIndex])):

        print(numbers[rowIndex][columnIndex], end=" ")
print()
