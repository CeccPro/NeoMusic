# NeoMusic
![Status](https://img.shields.io/badge/Status-Indev-yellow)
![Platform](https://img.shields.io/badge/Platform-Android-green)
![License](https://img.shields.io/badge/License-GPL%20v3.0-blue)

NeoMusic es un reproductor de música para Android que permite a los usuarios escuchar su música favorita de manera fácil y rápida sin necesidad de pagar por servicios de streaming convencionales. Con NeoMusic, los usuarios pueden acceder a su biblioteca de música local y disfrutar de una experiencia de reproducción fluida, o escuchar música en streaming desde plataformas compatibles (como YouTube usando YT-DLP). Además, ofrece una interfaz intuitiva y personalizable para organizar la música según preferencias del usuario.

## Características principales
- **Reproducción local**: Accede a tu música almacenada sin conexión a internet.
- **Streaming integrado**: Escucha desde plataformas compatibles (YouTube, servidores comunitarios o privados).
- **Interfaz intuitiva**: Navegación sencilla y controles accesibles.
- **Personalización avanzada**: Listas de reproducción, categorización por género/artista/álbum.
- **Sin anuncios ni telemetría**: Experiencia limpia y privada.
- **Código abierto**: Contribuciones comunitarias bienvenidas.
- **Arquitectura desacoplada**: UI separada del núcleo para mejor eficiencia.
- **Núcleo portable**: Reutilizable en diferentes plataformas.

## Tecnologías
- **Kotlin**: Interfaz y capas medias (Android)
- **C++**: Núcleo de reproducción y componentes de alto rendimiento
- **Python**: Integración con YT-DLP
- **FFmpeg**: Decodificación de audio de alta calidad

## Roadmap
- [X] Interfaz de usuario básica y aplicación mínima
- [ ] Configuración del proyecto base y estructura modular
- [ ] Implementación del núcleo en C++ y servidor backend local
- [ ] Sistema de logging y debugging
- [ ] Sistema de IDs y metadatos para organización
- [ ] Base de datos local (SQLite)
- [ ] Sistema de proveedores (providers)
- [ ] Caché en memoria y persistencia de metadatos
- [ ] Reproducción de música local
- [ ] Streaming mediante yt-dlp
- [ ] Control de calidad de audio (bitrate, formatos)
- [ ] Sistema de feed, búsqueda y descubrimiento
- [ ] Sistema de playlists
- [ ] Caché offline
- [ ] UI personalizable

## Contribuciones
Las contribuciones son bienvenidas. Para contribuir:
1. Fork del repositorio
2. Crea una rama para tu contribución
3. Asegúrate de que el código esté bien documentado
4. Envía un pull request con descripción de cambios

## Sugerencias
Si tienes alguna idea para mejorar NeoMusic, o encontraste un bug, abre un *issue* y lo revisaremos

## Licencia
GNU General Public License v3.0 (GPL-3.0) - Úsalo, modifícalo y redistribúyelo respetando los términos de la licencia.