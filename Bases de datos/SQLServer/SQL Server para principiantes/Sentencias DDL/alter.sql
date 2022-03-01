-- Modificar el tipo de dato de una columna
ALTER TABLE Empleados
    ALTER COLUMN CveEmpleado VARCHAR(5);

-- Agregar Columnas
ALTER TABLE Empleados
    ADD
        NSS VARCHAR(11) null,
        CURP VARCHAR(18),
        RFC VARCHAR(13) null

-- Modificar un SP
ALTER PROCEDURE PrimerStoredProcedure
    @CrearCatalogo BIT
    AS
        IF @CrearCatalogo = 1
            BEGIN
                ALTER TABLE CatGenero ADD DecripcionGenero VARCHAR(10);
            END
    GO
-- ejecutar SP
EXEC PrimerStoredProcedure 1;

-- Modificar funcion
ALTER FUNCTION PagoXDiasTrabajados
(
     @SueldoDiario MONEY,
     @DiasTrabajados INT
)
RETURNS MONEY
AS 
    BEGIN   
        DECLARE @MontoAPagar MONEY;
        SET @MontoAPagar = ( @SueldoDiario * @DiasTrabajados )+ (35 * @DiasTrabajados);
        RETURN @MontoAPagar
    END
GO
-- ejecutar funcion
SELECT dbo.PagoXDiasTrabajados(150.20, 8) AS Pago
