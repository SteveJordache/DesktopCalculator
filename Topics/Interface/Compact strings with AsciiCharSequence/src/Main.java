import java.util.*;

class AsciiCharSequence implements CharSequence  {
    byte[] asciiSequence;

    public AsciiCharSequence(byte[] asciiSequence) {
        this.asciiSequence = asciiSequence.clone();
    }

    @Override
    public int length() {
        return asciiSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) asciiSequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(asciiSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(this.asciiSequence);
    }
}