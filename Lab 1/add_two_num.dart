import 'dart:io';
void main(){
  stdout.write('Enter the first num :');
  int num1 = int.parse(stdin.readLineSync()!);

  stdout.write('Enter the second num :');
  int num2 = int.parse(stdin.readLineSync()!);

  print('Sum : ${num1 + num2}');

}