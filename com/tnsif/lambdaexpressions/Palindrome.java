//Program to define generic functional interface Palindrome

package com.tnsif.lambdaexpressions;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
