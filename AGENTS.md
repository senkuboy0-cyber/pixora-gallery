# Pixora Gallery — AGENTS.md

This file defines the complete behavior, development standards, UI/UX philosophy, architecture rules, animation systems, AI systems, branding systems, and engineering quality rules for all AI coding agents working on Pixora Gallery.

Applies to:
- Jules
- Gemini Code Assist
- Cursor
- Copilot
- OpenAI Codex
- Claude Code
- autonomous coding systems
- AI development agents

The mission is to create:
"A futuristic billion-dollar AI-powered Android media ecosystem."

---

# CORE PRODUCT VISION

Pixora is NOT a normal gallery app.

Pixora is:
- AI-powered media ecosystem
- futuristic Android experience
- cinematic media platform
- intelligent editing studio
- advanced playback engine
- flagship-level creative system

The app must combine:
- Google Photos intelligence
- Samsung Gallery smoothness
- VLC playback power
- Lightroom editing quality
- CapCut creative tools
- Nothing OS futuristic design
- iOS Liquid Glass depth system

Everything must feel:
- premium
- cinematic
- fluid
- intelligent
- futuristic
- luxurious

Never create generic Android UI.

---

# PRIMARY DEVELOPMENT PRIORITIES

Priority order:

1. UX smoothness
2. Premium UI quality
3. Stability
4. Performance
5. Animation polish
6. Scalability
7. AI integration
8. Future extensibility

Never sacrifice smoothness for unnecessary complexity.

---

# UI/UX PHILOSOPHY

The interface must feel:
- cinematic
- spatial
- immersive
- futuristic
- flagship-grade

Use:
- glassmorphism
- adaptive transparency
- layered depth
- dynamic blur
- floating surfaces
- responsive lighting
- cinematic transitions
- fluid motion systems

Inspirations:
- iOS 26 Liquid Glass
- Google Photos
- Samsung OneUI
- Nothing OS
- Fluent Design
- modern VLC concepts
- Arc Browser

Never use:
- boring flat layouts
- generic Compose templates
- cheap Material cards
- outdated Android visuals
- stiff transitions

The app should feel alive.

---

# ANIMATION SYSTEM RULES

Animations are critical.

Every interaction must feel:
- responsive
- physical
- elegant
- fluid

Use:
- spring animations
- physics-based scrolling
- shared element transitions
- blur transitions
- layered motion
- dynamic opacity
- depth animation
- predictive transitions

Scrolling must feel buttery smooth.

No:
- janky scrolling
- laggy recompositions
- instant screen jumps
- harsh transitions

Target:
- 60fps minimum
- 120fps optimized

Every screen transition should feel cinematic.

---

# COMPOSE DEVELOPMENT RULES

- Use Jetpack Compose only
- Never use XML layouts
- Avoid deeply nested composables
- Minimize recompositions
- Build reusable UI systems
- Use scalable design systems
- Use adaptive layouts

Create:
- reusable UI primitives
- typography engine
- motion engine
- dynamic theme engine
- spacing token system

The architecture must support future scaling.

---

# FONT ENGINE RULES

Build advanced dynamic typography engine.

Requirements:
- app-wide instant font switching
- no restart required
- dynamic font updates
- live font previews
- subtitle font integration
- editor font integration
- player UI font integration

Default:
- Android system default font

Add at least:
- Inter
- Poppins
- Manrope
- Product Sans style alternative
- SF Pro style alternative

Typography should feel:
- elegant
- clean
- futuristic
- readable

Support:
- font weight control
- typography scaling
- accessibility scaling

---

# SETTINGS SYSTEM RULES

Create one of the most advanced settings systems ever made for a gallery app.

The settings system must feel:
- futuristic
- premium
- intelligent
- modular

Do NOT create basic settings screens.

Use:
- categorized sections
- animated cards
- expandable settings
- blur surfaces
- searchable settings
- dynamic previews

Include:
- animation controls
- blur controls
- motion engine settings
- typography settings
- AI provider settings
- API management
- player settings
- subtitle settings
- decoder settings
- cache controls
- privacy settings
- backup settings
- sync settings
- developer options
- experimental features
- accessibility settings
- Android TV settings

The settings UI should feel flagship-level.

---

# VIDEO PLAYER RULES

Use hybrid playback architecture:
- ExoPlayer
- LibVLC

Reason:
- ExoPlayer = Android-native optimization
- VLC = advanced codec compatibility

Never use default VLC UI.

Build fully custom premium video player UI.

Player inspiration:
- Netflix
- VLC modern concepts
- Samsung Video Player
- YouTube ambient mode
- Apple TV player

Features required:
- gesture controls
- subtitle engine
- AI subtitle generation
- AI subtitle translation
- playback speed
- frame stepping
- floating playback
- PiP mode
- decoder switching
- HDR tone mapping
- ambient glow effects
- cinematic playback controls

Supported protocols:
- HLS
- DASH
- SMB
- FTP
- DLNA
- WebDAV
- RTSP
- IPTV

Player must feel:
- cinematic
- immersive
- luxurious

---

# AI SYSTEM RULES

The AI architecture must be modular.

Support:
- Gemini API
- OpenAI API
- Claude-compatible APIs
- OpenRouter
- Ollama
- LM Studio
- custom base URLs

Users must be able to:
- add custom API keys
- switch AI providers
- choose models dynamically
- customize endpoints

Do NOT hardcode providers.

---

# AI EDITING ENGINE RULES

The AI must interact with real editing systems.

Bad:
- fake prompt effects

Correct workflow:
1. analyze media
2. understand request
3. map request to editing tools
4. execute workflow
5. render result

Example:
"make cinematic"

System should:
- analyze lighting
- enhance shadows
- improve highlights
- apply cinematic LUT
- sharpen intelligently
- create depth grading

The AI must feel intelligent and real.

---

# PHOTO EDITOR RULES

Editor quality target:
- Lightroom
- Snapseed
- Photoshop Mobile

Requirements:
- non-destructive editing
- layer system
- undo/redo stack
- GPU acceleration
- smooth previews

Features:
- curves
- HSL
- LUT support
- AI erase
- AI relight
- clone tool
- healing tool
- blur tools
- sharpen tools
- perspective correction
- overlays
- text tools
- watermark tools
- retouching

Editor UI should feel:
- clean
- professional
- tool-focused
- premium

---

# VIDEO EDITOR RULES

The integrated video editor must feel modern.

Features:
- timeline editing
- trimming
- transitions
- LUT support
- AI transitions
- AI subtitles
- captions
- audio editing
- cinematic rendering
- export presets
- speed control
- background blur
- thumbnail editor

Timeline should feel:
- smooth
- responsive
- professional

---

# PERFORMANCE RULES

Performance is critical.

Always optimize:
- memory usage
- image decoding
- thumbnail rendering
- recompositions
- scrolling
- background processing

Use:
- lazy loading
- caching
- hardware acceleration
- coroutine optimization
- predictive loading
- thumbnail prefetching

Avoid:
- blocking main thread
- large bitmap allocations
- memory leaks
- unoptimized rendering

Media loading should feel instant.

---

# MEDIA SUPPORT RULES

Support:
- RAW
- HEIF
- HEVC
- HDR
- Ultra HDR
- motion photos

The app must handle large media libraries smoothly.

---

# SECURITY & PRIVACY RULES

Implement:
- encrypted vault
- biometric lock
- hidden albums
- secure export
- offline AI support
- local-first privacy

Never force cloud sync.

Privacy-first architecture is mandatory.

---

# ANDROID TV RULES

Support:
- D-pad navigation
- TV layouts
- remote controls
- mouse mode
- TV player mode

TV experience must feel:
- responsive
- readable
- premium

---

# ARCHITECTURE RULES

Use:
- Clean Architecture
- MVVM
- Repository Pattern
- Multi-module structure

Required modules:
core/
core-ui/
core-media/
core-player/
core-ai/
core-editor/
core-network/
core-database/
feature-gallery/
feature-video/
feature-editor/
feature-settings/
feature-ai/
feature-tv/
app/

Never build monolithic architecture.

---

# CODE QUALITY RULES

Code must be:
- production-grade
- modular
- scalable
- maintainable
- readable

Avoid:
- spaghetti code
- giant composables
- duplicated logic
- hardcoded values

Use:
- constants
- reusable systems
- theme tokens
- abstraction layers

---

# APP LOGO & BRANDING RULES

Create a world-class premium logo system for Pixora Gallery.

Do NOT use:
- generic gallery icons
- cheap gradients
- basic camera icons
- copied branding

The logo must feel:
- futuristic
- cinematic
- intelligent
- premium
- iconic

Logo inspiration:
- Nothing
- Apple
- Arc Browser
- Linear
- DeepMind
- futuristic AI brands

---

# LOGO CONCEPT SYSTEM

The logo should combine ideas of:
- media
- AI
- light
- pixels
- cinematic depth
- futuristic intelligence

Possible concepts:
- glowing prism
- liquid glass orb
- dynamic pixel core
- AI media crystal
- futuristic light ring

The logo should feel alive.

---

# LOGO STYLE RULES

Use:
- glassmorphism
- adaptive gradients
- dynamic glow
- layered transparency
- smooth geometry
- futuristic lighting

Avoid:
- flat vectors
- cheap clipart style
- random gradients
- outdated icon styles

---

# APP ICON RULES

Create:
- adaptive Android icon
- monochrome icon
- themed icon support
- Android 13+ themed compatibility

The icon must:
- look premium in dark mode
- look premium in light mode
- scale perfectly
- remain recognizable at small sizes

---

# ANIMATED LOGO RULES

Create animated logo system for:
- splash screen
- loading animations
- startup transitions

Animation style:
- cinematic
- glowing
- fluid
- futuristic

Use:
- blur animation
- light pulses
- smooth scaling
- depth motion
- liquid transitions

The splash experience should feel flagship-level.

---

# CODE-BASED LOGO GENERATION RULES

Generate logo using:
- Jetpack Compose Canvas
- vector rendering
- SVG systems
- procedural drawing code

Do NOT rely only on static PNG assets.

The logo should be drawable fully with code.

---

# DYNAMIC BRANDING SYSTEM

Add support for:
- animated gradients
- adaptive themes
- dynamic glow
- responsive colors
- seasonal themes
- AI-generated variants

Branding should evolve dynamically.

---

# COLOR SYSTEM RULES

Create premium futuristic color palette.

Suggested tones:
- deep black
- liquid blue
- cinematic cyan
- neon purple
- adaptive gradients

Colors must feel:
- premium
- luxurious
- futuristic
- AI-focused

Avoid:
- childish neon spam
- random saturated colors
- outdated material palettes

---

# GITHUB ACTIONS RULES

Always maintain fully working CI/CD.

Requirements:
- debug APK builds
- release APK builds
- split APK builds
- universal APK build
- artifact uploads

Generate APKs for:
- arm64-v8a
- armeabi-v7a
- x86
- x86_64

Use:
- Gradle caching
- Java 21
- workflow_dispatch
- optimized builds
- parallel execution

Workflow should:
- retry Gradle downloads
- reduce build time
- upload artifacts cleanly

---

# QUALITY VALIDATION CHECKLIST

Before finalizing anything ask:

Does this feel:
- premium?
- cinematic?
- smooth?
- futuristic?
- intelligent?
- flagship-grade?
- visually alive?

If NOT:
Refactor the implementation.

---

# FINAL PRODUCT TARGET

Pixora should feel like:
"A futuristic billion-dollar AI-powered Android media ecosystem built by a world-class design and engineering team."

The app must compete with:
- Google Photos
- Samsung Gallery
- Lightroom
- VLC
- CapCut

Everything must feel:
- luxurious
- polished
- intelligent
- cinematic
- futuristic
- world-class

Never deliver beginner-level experiences.
