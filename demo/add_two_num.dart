import 'dart:io';

void main(){
  print("Enter First Number = ");
  double a = double.parse(stdin.readLineSync()!);
  print("Enter Second Number = ");
  double b = double.parse(stdin.readLineSync()!);

  print("Sum of two number : ${a+b}");
}