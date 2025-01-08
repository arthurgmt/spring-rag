package fr.efrei.rag.service;

import org.springframework.stereotype.Service;
import fr.efrei.rag.repository.DocumentRepository;
import fr.efrei.rag.domain.Document;
import java.util.Optional;

@Service
public class DocumentService {
    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }
    
    public Document buildAndSaveDocument(Document document) {
        return documentRepository.save(document);
    }

    public Optional<Document> findById(Long id) {
        return documentRepository.findById(id);
    }
}
