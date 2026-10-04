# Changelog

## [1.0.0] - 2026-10-04

### Added

- Hold Alt and press the arrow keys to scroll. Up/Left scroll up, Down/Right scroll down. This makes Create's ALT menus (schematic tools, toolbox) usable on laptops whose touchpad can't scroll while Alt is held.
- Arrow keys also scroll while a mouse button is held, for "click and scroll" controls such as Create Simulated's physics staff and handles.
- Arrow keys scroll the properties of Create's wrench rotation menu without needing Alt.
- The scroll goes through Minecraft's normal scroll handling, so every mod that reacts to Alt + scroll works, not just Create.

### Fixed

- Fixed Create's toolbox menu ignoring the scroll wheel on non-square windows, caused by it measuring the cursor's distance from the center with the Y position for both axes.
