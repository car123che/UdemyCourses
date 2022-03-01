var sueldo1, sueldo2, porcentaje;
sueldo1 = parseFloat(prompt("Ingrese el sueldo: "));

if(sueldo1 > 1000){
    porcentaje = 0.10;
    sueldo2 = sueldo1 + sueldo1 * porcentaje;
}else{
    porcentaje = 0.15;
    sueldo2 = sueldo1 + sueldo1 * porcentaje;
}

document.writeln("Porcentaje aumento: " + (porcentaje * 100) + " -Sueldo Nuevo: " +  sueldo2);