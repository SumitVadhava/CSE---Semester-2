import 'dart:io';
void main(){
  stdout.write('Enter temp (c) = ');
  double c = double.parse(stdin.readLineSync()!);

  stdout.write('Enter temp (f) = ');
  double f = double.parse(stdin.readLineSync()!);


  print('temp in (f) : ${((c*9)/5) +32}');
  print('temp in (c) : ${((f-32)*5)/9}');
}