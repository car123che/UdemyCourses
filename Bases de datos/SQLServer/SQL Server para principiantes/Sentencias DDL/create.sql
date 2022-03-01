-- Crear una base de datos
CREATE DATABASE "CursoSQL_Principiantes";


-- CREAR TABLAS
CREATE TABLE Empleados(
    CveEmpleado VARCHAR(3) not null,
    nombre VARCHAR(100) not null,
    ApPaterno VARCHAR(100) not null,
    ApMaterno VARCHAR(100),
    FechaNacimiento DATETIME not null,
    CveGenero VARCHAR(1) not null,
    CveEstadoCivil INT not null,
    Nacionalidad VARCHAR(50) not null,
    CorreoElectroncio VARCHAR(100) not null
);
CREATE TABLE CatEstadoCivil(
    CveEstadoCivil INT not null,
    DescEstadoCivil VARCHAR(20)
);


-- CREAR STORED PROCEDURES
CREATE PROCEDURE PrimerStoredProcedure
    @CrearCatalogo BIT
    AS
        IF @CrearCatalogo = 1
            BEGIN
                CREATE TABLE CatGenero(CveGenero VARCHAR(1));
            END
    GO
--ejecutar el SP
EXEC PrimerStoredProcedure 1;


-- CREAR FUNCIONES
CREATE FUNCTION PagoXDiasTrabajados
(
     @SueldoDiario MONEY,
     @DiasTrabajados INT
)
RETURNS MONEY
AS 
    BEGIN   
        DECLARE @MontoAPagar MONEY;
        SET @MontoAPagar = @SueldoDiario * @DiasTrabajados;
        RETURN @MontoAPagar
    END
-- ejecutar funcion
SELECT dbo.PagoXDiasTrabajados(150.20, 8) AS Pago


-- CREAR INDICES
CREATE INDEX IndiceNacionalidad ON Empleados (Nacionalidad);