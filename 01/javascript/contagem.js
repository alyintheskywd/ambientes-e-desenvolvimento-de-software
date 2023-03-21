function count(numbers, N) {
  let count = 0;
  for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] >= 1 && numbers[i] <= N) {
      count++;
    }
  }
  return count;
}
