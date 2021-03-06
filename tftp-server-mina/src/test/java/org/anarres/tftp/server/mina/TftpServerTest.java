/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.tftp.server.mina;

import org.anarres.tftp.protocol.engine.TftpServerTester;
import org.junit.Test;

/**
 *
 * @author shevek
 */
public class TftpServerTest {

    @Test
    public void testServer() throws Exception {
        TftpServerTester tester = new TftpServerTester();
        TftpServer server = new TftpServer(tester.getProvider(), tester.getPort());
        try {
            server.start();
            tester.run();
        } finally {
            server.stop();
        }
    }
}