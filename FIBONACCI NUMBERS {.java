public class Main {
    
}
function fibonacci(n) {
  const sequence = [];
  let a = 0n;
  let b = 1n;
  for (let i = 0; i < n; i++) {
    sequence.push(a);
    [a, b] = [b, a + b];
  }
  return sequence;
}

function main() {
  const numbers = fibonacci(100);
  numbers.forEach((num, index) => {
    console.log(`${index + 1}: ${num}`);
  });
}

main();
