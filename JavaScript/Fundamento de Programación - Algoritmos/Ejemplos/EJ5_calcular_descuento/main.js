const DESCUENTO = 0.15;
var cantidad, precio, desc, total1, total2;
cantidad = parseInt(prompt("Ingresar Cantidad: "));
precio = parseFloat(prompt("Ingresar Precio: "));

total1 = cantidad * precio;
desc = total1 * DESCUENTO;
total2 = total1 - desc;

document.write("-El Descuento es de : " +  desc);
document.writeln("  -El total a pagar es de: " +  total2);

