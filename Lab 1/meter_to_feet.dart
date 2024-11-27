import 'dart:io';

void main(){

  stdout.write('Enter the meter :');
  double m = double.parse(stdin.readLineSync()!);

  print("Feet:${m*3270}");

}