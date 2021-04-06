package br.gov.go.saude.kettle;

import com.github.gcms.blast.BlastInputStream;
import org.pentaho.di.core.compress.CompressionInputStream;
import org.pentaho.di.core.compress.CompressionProvider;

import java.io.InputStream;

public class BlastCompressionInputStream extends CompressionInputStream {
    public BlastCompressionInputStream(InputStream in, CompressionProvider provider) {
        super(new BlastInputStream(in), provider);
    }
}
