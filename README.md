# 💱 Conversor de Monedas - Challenge ONE

Este proyecto es un **conversor de monedas** realizado en **Java puro (sin frameworks)**, como parte del curso de programación del programa Oracle Next Education (ONE). Utiliza una API externa para obtener tasas de cambio en tiempo real.

## 🛠️ Tecnologías utilizadas

- Java 17+
- IntelliJ IDEA
- API: [ExchangeRate API](https://www.exchangerate-api.com/)
- Postman (para pruebas de endpoints)
- Git + GitHub

## 🚀 ¿Qué hace el programa?

Permite convertir entre las siguientes monedas:

- Dólar ↔ Peso argentino
- Dólar ↔ Real brasileño
- Dólar ↔ Peso colombiano

Además:
- Muestra un menú interactivo en consola
- Llama a una API para obtener la tasa de cambio
- Lee una clave secreta desde un archivo externo

## ⚙️ ¿Cómo ejecutar el proyecto?

1. **Clona este repositorio:**

```bash
git clone https://github.com/tu-usuario/tu-repo.git
cd tu-repo
```
3. **Consigue tu API key**
- Ve al sitio oficial de la API: [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
- Regístrate con tu correo electrónico 
- Luego de confirmar tu cuenta, accede a tu panel de usuario 
- Copia tu clave personalizada (API Key)


4. **Crea el archivo `config.properties` en la raíz del proyecto**
- Pega tu key en el archivo `config.properties` de esta manera:

```properties
api_key=TU_CLAVE_API
```

4. **Ejecuta el proyecto desde IntelliJ**

- Abre el proyecto en IntelliJ IDEA 
- Ejecuta la clase `Main.java`

## Licencia 📄
Este proyecto está licenciado bajo la Licencia MIT - consulta el archivo LICENSE para más detalles.

--- 

¡Gracias por visitar este proyecto! 🎉

Por [Santohdz](https://github.com/Santohdz) 🎴