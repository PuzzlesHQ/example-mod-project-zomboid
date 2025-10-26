# example-mod-project-zomboid
The example mod for java modding Project Zomboid w/ PuzzleLoader

## Update/Setup Dev ENV
- run `./gradlew generateZomboidJar`
- run `./gradlew transformJars`

## Refreshing Dependencies
- run `./gradlew transformJars`
- Refresh Gradle

## Testing your Mod
- run `./gradlew runModdedClient`

Testing Vanilla

- run `./gradlew runVanillaClient`

## Releasing your Mod
- run `./gradlew buildMergedjar`
- go to `build/libs/` <>
- send or upload your `{mod-name}-{mod-version}-merged.jar` file somewhere
