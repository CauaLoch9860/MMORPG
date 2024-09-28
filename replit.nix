{ pkgs }: {
    deps = [
      pkgs.docker-compose_1
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}