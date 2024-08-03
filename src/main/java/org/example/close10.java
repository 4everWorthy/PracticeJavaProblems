//package org.example;
//
// public int close10(int a, int b) {
//   // Calculate the absolute differences
//   int diffA = Math.abs(a - 10); // Uses Math.abs to find the absolute difference between a and 10
//   int diffB = Math.abs(b - 10); // Uses Math.abs to find the absolute difference between b and 10

//   // Compare the differences
//   if (diffA < diffB) {
//     return a; // `a` is closer to 10
//   } else if (diffB < diffA) {
//     return b; // `b` is closer to 10
//   } else {
//     return 0; // Both are equally close to 10
//   }
// }

/** We need to find which of two given integer values is closest to the number 10.
 * If both values are equally close to 10, we should return 0.
 * We can use the Math.abs method to calculate the absolute difference between each value and 10.
 */
