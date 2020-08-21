package com.company.functionalInterface;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class RunnerableApiTest {

    @Test
    void 러너러블() {
        Runnable runnable = ()->{
            String str = "wonseok";
            assertEquals("wonseok",str);
        };
    }
}
