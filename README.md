# NeoMusic
[![Status](https://img.shields.io/badge/Status-Indev-yellow)]
[![Platform](https://img.shields.io/badge/Platform-Android-green)]
[![License](https://img.shields.io/badge/License-GPL%20v3.0-blue)]

NeoMusic es un reproductor de música para Android que permite a los usuarios escuchar su música favorita de manera fácil y rápida sin necesidad de pagar por servicios de streaming convencionales. Con NeoMusic, los usuarios pueden acceder a su biblioteca de música local y disfrutar de una experiencia de reproducción fluida y sin interrupciones, o escuchar música en streaming desde plataformas compatibles (como YouTube, utilizando de por medio YT-DLP). Además, NeoMusic ofrece una interfaz intuitiva y personalizable, permitiendo a los usuarios organizar su música de acuerdo a sus preferencias y crear listas de reproducción personalizadas.

## Características principales
- Reproducción de música local: Los usuarios pueden reproducir su música almacenada en el dispositivo sin necesidad de conexión a internet.
- Reproducción en streaming: Los usuarios pueden escuchar música en streaming desde plataformas compatibles, como YouTube o servidores hosteados por la comunidad (O incluso su propio servidor!).
- Interfaz intuitiva: NeoMusic cuenta con una interfaz fácil de usar que permite a los usuarios navegar por su biblioteca de música y controlar la reproducción de manera sencilla.
- Personalización: Los usuarios pueden personalizar la apariencia de la aplicación y organizar su música según sus preferencias, creando listas de reproducción personalizadas y categorizando su música por género, artista o álbum.
- Sin anuncios: NeoMusic ofrece una experiencia de reproducción sin interrupciones, sin anuncios molestos, lo que permite a los usuarios disfrutar de su música sin distracciones.
- Sin telemetría: NeoMusic no recopila ni comparte datos de los usuarios, garantizando la privacidad y seguridad de la información personal.
- Código abierto: NeoMusic es un proyecto de código abierto, lo que permite a la comunidad contribuir al desarrollo y mejora de la aplicación.

## Desarrollo
NeoMusic está desarrollado utilizando:
- Kotlin para la aplicación Android, capas medias y capas de integración
- C++ para el núcleo de reproducción y componentes de alto rendimiento
- Python para la integración con YT-DLP
Esta arquitectura permite mantener una interfaz rápida mientras delega las tareas más pesadas a componentes optimizados. También se usa FFmpeg para la decodificación de audio, lo que garantiza una reproducción de alta calidad y compatibilidad con una amplia variedad de formatos de audio.

## Roadmap
- [ ] Streaming mediante yt-dlp
- [ ] Sistema de feed, búsqueda y descubrimiento de música
- [ ] Reproducción de música local
- [ ] Sistema de playlists
- [ ] Caché offline
- [ ] UI personalizable

## Contribuciones
Las contribuciones al proyecto NeoMusic son bienvenidas. Si deseas contribuir, puedes seguir estos pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama para tu contribución.
3. Realiza tus cambios y asegúrate de que el código esté bien documentado.
4. Envía un pull request describiendo tus cambios y por qué deberían ser incluidos en el proyecto.

## Licencia
NeoMusic está licenciado bajo GNU General Public License v3.0 (GPL-3.0).
Esto permite usar, modificar y redistribuir el software siempre que se respeten los términos de la licencia.