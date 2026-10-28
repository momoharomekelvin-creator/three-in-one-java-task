let numbers = [
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
];


for (let rowIndex = 0; rowIndex < numbers.length; rowIndex++) {

let temporaryNumber = numbers[rowIndex][0];

numbers[rowIndex][0] = numbers[rowIndex][2];

numbers[rowIndex][2] = temporaryNumber;

}


for (let rowIndex = 0; rowIndex < numbers.length; rowIndex++) {

console.log(numbers[rowIndex].join(" "));

}
