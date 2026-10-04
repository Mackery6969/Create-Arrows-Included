# Create: Arrows Included

Adds laptop arrow keys support to the ALT Submenus in Create.

On many laptops, two-finger touchpad scrolling stops working while Alt is held (Ctrl + scroll is fine), so Create's ALT menus, like the schematic tool bar, can't be scrolled. This client-side mod lets the arrow keys stand in for the scroll wheel.

## Controls

| Hold | Press | Does |
| --- | --- | --- |
| Alt | Up / Left | Scroll up |
| Alt | Down / Right | Scroll down |
| Any mouse button | Arrow keys | Scroll (for "click and scroll" controls such as Simulated's physics staff) |
| — (inside Create's wrench menu) | Up / Down | Switch the property being changed |

The arrow keys produce a real scroll event inside Minecraft, so any mod that uses Alt + scroll works, not only Create. That includes Create's schematic tools and toolbox, and Create Simulated / Aeronautics.

It also fixes a Create bug where the toolbox menu ignored the scroll wheel on non-square windows.

## Requirements

- Minecraft 1.21.1, NeoForge 21.1+
- Create 6 (optional; the arrow-key scrolling works without it)

Client-side only: servers don't need it installed.

## Building

```sh
./gradlew build
```

The jar ends up in `build/libs/`. Use `./gradlew runClient` to launch a dev client.

## Releasing

1. Bump `mod_version` in `gradle.properties`.
2. Add a section for the version to `CHANGELOG.md` and an entry plus promos to `updates.json`.
3. Push a `v<mod_version>` tag. The Release workflow builds, publishes to GitHub Releases, CurseForge / Modrinth (when the `CURSEFORGE_PROJECT_ID` / `MODRINTH_PROJECT_ID` variables are set) and maven.mackery.com.

## License

MIT, see [LICENSE.txt](LICENSE.txt).
