# Pixora Gallery — AGENTS.md

This file defines how all AI coding agents must behave while working on the Pixora Gallery project.

Applies to:
- Jules
- Gemini Code Assist
- Cursor
- Copilot
- OpenAI Codex
- Claude Code
- Any autonomous coding system

The goal is to maintain:
- premium quality
- scalable architecture
- futuristic UX
- smooth performance
- flagship-level Android standards

---

# CORE MISSION

Pixora is NOT a basic gallery app.

Pixora is:
- AI-powered media ecosystem
- premium Android experience
- futuristic media platform
- cinematic gallery system
- advanced playback engine
- AI editing studio

Every implementation decision must support:
- premium UX
- fluidity
- intelligence
- scalability
- visual polish

Never build generic Android UI.

---

# DEVELOPMENT PRIORITIES

Priority order:

1. Smooth UX
2. Premium UI quality
3. Stability
4. Performance
5. Animation quality
6. Scalability
7. AI integration
8. Feature expansion

Never sacrifice UI smoothness for unnecessary complexity.

---

# UI/UX RULES

The app must feel:
- cinematic
- premium
- futuristic
- fluid
- flagship-grade

Never use:
- outdated Material layouts
- cheap card designs
- flat boring UI
- old Android visual patterns
- generic Compose templates

Use:
- depth
- blur
- motion
- adaptive transparency
- layered UI
- dynamic color systems
- smooth transitions
- floating surfaces

UI inspirations:
- iOS 26 Liquid Glass
- Google Photos
- Samsung Gallery
- Nothing OS
- Fluent Design
- modern VLC concepts

---

# ANIMATION RULES

Animations are EXTREMELY important.

Every interaction should feel:
- alive
- reactive
- polished
- physically responsive

Use:
- spring animations
- physics-based scrolling
- shared element transitions
- blur transitions
- dynamic opacity
- layered motion
- predictive animations

Avoid:
- janky animations
- instant UI jumps
- abrupt transitions
- laggy recompositions

Target:
- 60fps minimum
- 120fps optimized

All scrolling should feel buttery smooth.

---

# COMPOSE RULES

- Use Jetpack Compose only
- Never use XML layouts
- Avoid deeply nested composables
- Minimize recompositions
- Use stable state management
- Use reusable components
- Use scalable design systems
- Use adaptive layouts

Create:
- reusable UI primitives
- scalable theming system
- centralized spacing system
- typography engine
- motion engine

---

# FONT ENGINE RULES

Create advanced dynamic typography engine.

Requirements:
- instant app-wide font switching
- no restart required
- all screens update dynamically
- subtitles use selected font
- editor uses selected font
- player UI uses selected font

Default:
- Android system font

Add:
- Inter
- Poppins
- Manrope
- Product Sans style alternative
- SF Pro style alternative

Add:
- live preview
- weight controls
- typography scaling

Typography should feel:
- elegant
- readable
- premium

---

# SETTINGS SYSTEM RULES

Settings system must be massive and modular.

Do NOT create basic settings pages.

Create:
- categorized sections
- expandable cards
- searchable settings
- animated setting transitions
- premium settings UI

Include:
- animation settings
- blur settings
- motion engine settings
- AI provider settings
- API management
- subtitle engine settings
- playback settings
- decoder settings
- cache settings
- privacy settings
- backup settings
- developer settings
- experimental features
- accessibility settings
- Android TV settings

Settings must feel:
- futuristic
- intelligent
- professional

---

# VIDEO PLAYER RULES

Use hybrid architecture:
- ExoPlayer
- LibVLC

Reason:
- ExoPlayer = Android-native optimization
- VLC = advanced codec compatibility

Never use VLC default UI.

Build fully custom modern player UI.

Player must feel:
- cinematic
- immersive
- smooth
- premium

Features required:
- gestures
- subtitle system
- AI subtitle generation
- HDR support
- playback speed
- frame stepping
- floating mode
- PiP
- decoder controls
- ambient glow system

Playback must support:
- HLS
- DASH
- SMB
- FTP
- WebDAV
- DLNA
- IPTV
- RTSP

---

# AI SYSTEM RULES

AI architecture must be modular.

Support:
- Gemini API
- OpenAI API
- OpenRouter
- Ollama
- LM Studio
- custom base URLs

Users must be able to:
- switch providers
- add API keys
- customize endpoints
- select models dynamically

Do NOT hardcode providers.

---

# AI EDITING LOGIC

The AI must interact with actual editing pipelines.

Bad:
- fake prompt-based effects

Good:
1. analyze media
2. understand request
3. map request to tools
4. execute workflow
5. render result

Example:
"make cinematic"

The system should:
- detect lighting
- adjust contrast
- apply LUT
- enhance shadows
- sharpen intelligently
- create cinematic grading

AI must feel intelligent.

---

# PHOTO EDITOR RULES

Editor quality target:
- Lightroom
- Snapseed
- Photoshop Mobile

Required:
- non-destructive editing
- layer system
- undo/redo stack
- GPU acceleration
- smooth preview rendering

Features:
- curves
- HSL
- LUT
- blur
- sharpen
- AI erase
- healing
- clone
- perspective correction
- retouching
- overlays

Editor UI must feel:
- clean
- premium
- tool-focused

---

# VIDEO EDITOR RULES

Video editor should NOT feel basic.

Features:
- timeline editor
- trimming
- transitions
- captions
- audio editing
- LUT support
- AI transitions
- AI subtitles
- export presets
- cinematic rendering

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
- thumbnail caching
- scrolling
- recompositions
- background tasks

Use:
- lazy loading
- efficient paging
- hardware acceleration
- coroutine optimization
- thumbnail preloading

Avoid:
- blocking main thread
- large bitmap allocations
- unnecessary recompositions
- memory leaks

---

# MEDIA LOADING RULES

Media loading must feel instant.

Use:
- predictive loading
- thumbnail caching
- prefetching
- smart memory management

Support:
- RAW
- HEIF
- HEVC
- Ultra HDR
- motion photos

---

# SECURITY RULES

Implement:
- encrypted vault
- biometric authentication
- secure hidden albums
- local-first privacy
- offline AI support

Never force cloud sync.

Privacy-first design is mandatory.

---

# ANDROID TV RULES

Support:
- D-pad navigation
- remote gestures
- mouse mode
- TV layouts
- TV playback mode

TV UI should feel:
- optimized
- readable
- smooth

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

Never create monolithic architecture.

---

# CODE QUALITY RULES

Code must be:
- production-grade
- modular
- scalable
- readable
- maintainable

Avoid:
- spaghetti code
- giant composables
- duplicated logic
- hardcoded values

Use:
- constants
- theme tokens
- reusable systems
- abstraction layers

---

# GITHUB ACTIONS RULES

Always maintain working CI/CD.

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
- parallel optimization

Workflow must:
- retry Gradle downloads
- reduce build times
- upload artifacts cleanly

---

# DESIGN QUALITY CHECKLIST

Before finalizing UI:
- Does it feel premium?
- Does it feel smooth?
- Does it feel futuristic?
- Does it feel cinematic?
- Does it feel flagship-grade?
- Does it avoid generic Android design?
- Does it feel visually alive?

If NOT:
Refactor the UI.

---

# FINAL PRODUCT TARGET

Pixora should feel like:
"A billion-dollar futuristic AI-powered Android media ecosystem."

The app should compete visually and technically with:
- Google Photos
- Samsung Gallery
- Lightroom
- VLC
- CapCut

Everything must feel:
- premium
- polished
- cinematic
- intelligent
- futuristic
- world-class

Never deliver beginner-level experiences.
