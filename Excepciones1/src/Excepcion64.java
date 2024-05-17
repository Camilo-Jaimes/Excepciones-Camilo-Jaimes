import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Excepcion64 {
public static void main(String[] args) {
        String midiFile = "cancion.mid";

        try {
            reproducirMIDI(midiFile);
            System.out.println("Reproducción del archivo MIDI completada correctamente.");
        } catch (InvalidMidiDataException e) {
            System.out.println("Error al cargar el archivo MIDI: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException | MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void reproducirMIDI(String midiFile) throws InvalidMidiDataException, IOException, MidiUnavailableException {
        Sequencer sequencer = MidiSystem.getSequencer();
        if (sequencer == null) {
            throw new MidiUnavailableException("No se pudo obtener un secuenciador MIDI.");
        }

        try {
            sequencer.open();
            Sequence sequence = MidiSystem.getSequence(new File(midiFile));
            sequencer.setSequence(sequence);
            sequencer.start();
            while (sequencer.isRunning()) {
            }
            sequencer.stop();
        } finally {
            if (sequencer.isOpen()) {
                sequencer.close();
            }
        }
    }
}
