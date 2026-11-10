# Sistema de Registro de Empleados (Java Swing)

Aplicación de escritorio en **Java Swing** creada en **NetBeans IDE** para el registro y gestión de empleados con validaciones y cálculo de estadísticas en tiempo real.

## Características

- **Diseño Visual (JFrame Form)**:
  - Formulario con campos de Nombre Completo (`JTextField`), Documento (`JTextField`), Cargo (`JComboBox`), Área (`JComboBox`), Salario (`JSpinner`) y Fecha de Ingreso (`JFormattedTextField`).
  - Botones de acción: **Guardar**, **Limpiar** y **Eliminar Registro**.
  - Tabla (`JTable`) con las columnas: `NOMBRE`, `DOCUMENTO`, `CARGO`, `ÁREA`, `SALARIO`.
- **Nivel Básico**:
  - Registro de empleados, visualización en tabla y limpieza del formulario.
- **Nivel Intermedio**:
  - Validación de campos vacíos con mensajes de alerta.
  - Validación de que el salario sea estrictamente mayor a `0`.
- **Nivel Avanzado (Estadísticas)**:
  - Cantidad total de empleados registrados.
  - Promedio salarial formateado.
  - Empleado con mayor salario.

