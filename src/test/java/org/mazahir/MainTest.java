package org.mazahir;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class MainTest {
    PermissionManager permManager;
    HashMap<PermissionLevel, String> permissons = new HashMap<>();

    @BeforeEach
    void setUp() {
        permManager = new PermissionManager();

        permissons.put(PermissionLevel.ADMIN, "ADMIN");
        permissons.put(PermissionLevel.USER, "USER");
        permissons.put(PermissionLevel.DEVELOPER, "DEVELOPER");
    }

    @Test
    void testGetCurrentLevel() {
        for (PermissionLevel permissionLevel: permissons.keySet())
        {
            permManager.set(permissionLevel);
            assertEquals(permissons.get(permissionLevel), permManager.getCurrentLevel());
        }
    }
}

