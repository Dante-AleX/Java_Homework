/*
Вывести все простые числа от 1 до 1000
 */

package Java_Homework.Homework_1;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Task_002 {

        public static List<Integer> getAllPrimesLessThan(int sieveSize) {
                BitSet sieve = new BitSet(sieveSize);
                sieve.set(0, sieveSize - 1, true);
                sieve.set(0, false);
                sieve.set(1, false);
                for (int i = 2; i * i < sieve.length(); i++) {
                        if (sieve.get(i)) {
                                for (int j = i * i; j < sieve.length(); j += i) {
                                        sieve.set(j, false);
                                }
                        }
                }

                List<Integer> primes = new ArrayList<>();
                for (int i = 2; i < sieve.length(); i++) {
                        if (sieve.get(i)) {
                                primes.add(i);
                        }
                }
                return primes;
        }

        public static void main(String[] args) throws Exception {
                List<Integer> primes_result = new ArrayList<>();
                primes_result = getAllPrimesLessThan(1000);
                System.out.println("Список простых чисел:");
                for (int i = 0; i < primes_result.size(); i++) {
                        System.out.printf("%d ", primes_result.get(i));
                        if (i % 10 == 0 && i > 0) {
                                System.out.println();
                        }
                }

        }
}
