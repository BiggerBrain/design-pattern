package structural.patterns.facade.example;

import lombok.extern.log4j.Log4j2;

/**
 * @author lishixiong
 */
@Log4j2
public class Computer {
    private Cpu    cpu;
    private Memory memory;
    private Disk   disk;

    public Computer(Cpu cpu, Memory memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public void startup() {
        log.info("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        log.info("start computer finished!");
    }

    public void shutdown() {
        log.info("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        log.info("computer closed!");
    }
}
