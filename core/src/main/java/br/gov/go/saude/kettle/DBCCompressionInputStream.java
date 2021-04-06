package br.gov.go.saude.kettle;

import com.github.gcms.dbc.DBCInputStream;
import org.pentaho.di.core.compress.CompressionInputStream;
import org.pentaho.di.core.compress.CompressionProvider;

import java.io.InputStream;

public class DBCCompressionInputStream extends CompressionInputStream {
    public DBCCompressionInputStream(InputStream in, CompressionProvider provider) {
        super(new DBCInputStream(in), provider);
    }
}
