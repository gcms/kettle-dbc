package br.gov.go.saude.kettle;

import org.pentaho.di.core.compress.CompressionInputStream;
import org.pentaho.di.core.compress.CompressionOutputStream;
import org.pentaho.di.core.compress.CompressionPlugin;
import org.pentaho.di.core.compress.CompressionProvider;

import java.io.InputStream;
import java.io.OutputStream;

@CompressionPlugin(id = "Blast", name = "Blast", description = "PkWare DCL Explode")
public class BlastCompressionProvider implements CompressionProvider {
    @Override
    public CompressionInputStream createInputStream(InputStream in) {
        return new BlastCompressionInputStream(in, this);
    }

    @Override
    public boolean supportsInput() {
        return true;
    }

    @Override
    public CompressionOutputStream createOutputStream(OutputStream out) {
        return null;
    }

    @Override
    public boolean supportsOutput() {
        return false;
    }

    @Override
    public String getName() {
        return "Blast";
    }

    @Override
    public String getDescription() {
        return "PkWare DCL Explode";
    }

    @Override
    public String getDefaultExtension() {
        return "";
    }
}
