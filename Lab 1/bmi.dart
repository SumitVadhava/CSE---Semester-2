import 'dart:io';

void main(){
  stdout.write("Enter the weight in pounds =");
  double pounds = double.parse(stdin.readLineSync()!);

  stdout.write("Enter the height in inches =");
  double height = double.parse(stdin.readLineSync()!);
  height /= 39.97;

  print("BMI : ${(pounds * 0.45359237) / (height * height)}");

}