import 'dart:io';

void main(){
  print('hello');

  print("Enter First Number = ");
  int a = int.parse(stdin.readLineSync()!);
  print("Enter Second Number = ");
  int b = int.parse(stdin.readLineSync()!);
  print('A : $a , B: $b');
  a = a+b;
  b = a - b;
  a = a-b;
  print('A : $a , B: $b');


}
