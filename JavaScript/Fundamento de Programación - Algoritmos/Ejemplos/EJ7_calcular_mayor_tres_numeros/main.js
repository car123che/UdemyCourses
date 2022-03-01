var n1, n2, n3, temp, mayor;

n1 = parseFloat(prompt("Ingrese el primer número: "));
n2 = parseFloat(prompt("Ingrese el segundo número: "));
n3 = parseFloat(prompt("Ingrese el tercer número: "));

if( n1>n2){
    temp = n1;
}else{
    temp = n2;
}

if(temp>n3){
    mayor = temp;
}else{
    mayor = n3;
}

document.write("El número mayor es: " + mayor);